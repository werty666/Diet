package com.example.dietolog1;



import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class raschet extends Activity implements OnClickListener {
	final String LOG_TAG = "myLogs";
	Button btnAdd, btnRead, btnClear;
	EditText etName, etEmail;
	DBHelper dbHelper;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.raschet);
	btnAdd = (Button) findViewById(R.id.btnAdd);
	btnAdd.setOnClickListener(this);
	btnRead = (Button) findViewById(R.id.btnRead);
	btnRead.setOnClickListener(this);
	btnClear = (Button) findViewById(R.id.btnClear);
	btnClear.setOnClickListener(this);
	etName = (EditText) findViewById(R.id.etName);
	etEmail = (EditText) findViewById(R.id.etEmail);
	// ������� ������ ��� �������� � ���������� �������� ��
	dbHelper = new DBHelper(this);
	}
	@Override
	public void onClick(View v) {
		
	// ������� ������ ��� ������
	ContentValues cv = new ContentValues();
	// �������� ������ �� ����� �����
	String name = etName.getText().toString();
	String email = etEmail.getText().toString();
	// ������������ � ��
	SQLiteDatabase db = dbHelper.getWritableDatabase();
	switch (v.getId()) {
	case R.id.btnAdd:
	Log.d(LOG_TAG, "--- Insert in mytable: ---");
	// ���������� ������ ��� ������� � ���� ���: ������������ ������� - ��������
	cv.put("name", name);
	cv.put("email", email);
	// ��������� ������ � �������� �� ID
	long rowID = db.insert("mytable", null, cv);
	Log.d(LOG_TAG, "row inserted, ID = " + rowID);

	break;
	case R.id.btnRead:
	Log.d(LOG_TAG, "--- Rows in mytable: ---");
	// ������ ������ ���� ������ �� ������� mytable, �������� Cursor
	Cursor c = db.query("mytable", null, null, null, null, null, null);
	// ������ ������� ������� �� ������ ������ �������
	// ���� � ������� ��� �����, �������� false
	if (c.moveToFirst()) {
	// ���������� ������ �������� �� ����� � �������
	int idColIndex = c.getColumnIndex("id");
	int nameColIndex = c.getColumnIndex("name");
	int emailColIndex = c.getColumnIndex("email");
	String [] names = new String [c.getCount()];

	int i=0;
	do {

	// �������� �������� �� ������� �������� � ����� ��� � ���
	Log.d(LOG_TAG,"ID = " + c.getInt(idColIndex) +", name = " + c.getString(nameColIndex) +", email = " + c.getString(emailColIndex));

	names[i] = c.getString(nameColIndex) + c.getString(emailColIndex);
	i++;

	// ������� �� ��������� ������
	// � ���� ��������� ��� (������� - ���������), �� false - ������� �� �����
	} while (c.moveToNext());
	ListView list = (ListView) findViewById(R.id.listView1);

	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	    android.R.layout.simple_list_item_1, names);
	    setListAdapter(adapter);
	list.setAdapter(adapter);
	} else
	Log.d(LOG_TAG, "0 rows");
	break;
	case R.id.btnClear:
	Log.d(LOG_TAG, "--- Clear mytable: ---");
	// ������� ��� ������
	int clearCount = db.delete("mytable", null, null);
	Log.d(LOG_TAG, "deleted rows count = " + clearCount);
	break;
	}

		
	// ��������� ����������� � ��
	dbHelper.close();
	}
	private void setListAdapter(ArrayAdapter<String> adapter) {
		// TODO Auto-generated method stub
		
	}
	class DBHelper extends SQLiteOpenHelper {
	public DBHelper(Context context) {
	// ����������� �����������
	super(context, "myDB", null, 1);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
	Log.d(LOG_TAG, "--- onCreate database ---");
	// ������� ������� � ������
	db.execSQL("create table mytable ("
	+ "id integer primary key autoincrement,"
	+ "name text,"
	+ "email text" + ");");
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}
	}
	}