package com.google.android.gms.samples.vision.barcodereader.data.generated;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.samples.vision.barcodereader.data.ProductsContract;
import java.lang.Override;
import java.lang.String;

public class ProductsDatabase extends SQLiteOpenHelper {
  private static final int DATABASE_VERSION = 1;

  public static final String TABLE_PERSON = "CREATE TABLE product ("
   + ProductsContract.PersonEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
   + ProductsContract.PersonEntry.COLUMN_NAME + " TEXT NOT NULL,"
   + ProductsContract.PersonEntry.COLUMN_COUNT + " TEXT NOT NULL,"
   + ProductsContract.PersonEntry.COLUMN_PRICE + " REAL NOT NULL,"
   + ProductsContract.PersonEntry.COLUMN_BARCODE_ID + " TEXT NOT NULL UNIQUE)";

  private static volatile ProductsDatabase instance;

  private Context context;

  private ProductsDatabase(Context context) {
    super(context, "productsDatabase.db", null, DATABASE_VERSION);
    this.context = context;
  }

  public static ProductsDatabase getInstance(Context context) {
    if (instance == null) {
      synchronized (ProductsDatabase.class) {
        if (instance == null) {
          instance = new ProductsDatabase(context);
        }
      }
    }
    return instance;
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
    db.execSQL(TABLE_PERSON);
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
  }
}
