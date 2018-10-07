package com.google.android.gms.samples.vision.barcodereader.data.generated.values;

import android.content.ContentValues;
import com.google.android.gms.samples.vision.barcodereader.data.ProductsContract;
import java.lang.String;

public class ProductValuesBuilder {
  ContentValues values = new ContentValues();

  public ProductValuesBuilder Id(int value) {
    values.put(ProductsContract.PersonEntry._ID, value);
    return this;
  }

  public ProductValuesBuilder Id(long value) {
    values.put(ProductsContract.PersonEntry._ID, value);
    return this;
  }

  public ProductValuesBuilder columnName(String value) {
    values.put(ProductsContract.PersonEntry.COLUMN_NAME, value);
    return this;
  }

  public ProductValuesBuilder columnCount(String value) {
    values.put(ProductsContract.PersonEntry.COLUMN_COUNT, value);
    return this;
  }

  public ProductValuesBuilder columnPrice(float value) {
    values.put(ProductsContract.PersonEntry.COLUMN_PRICE, value);
    return this;
  }

  public ProductValuesBuilder columnBarcodeId(String value) {
    values.put(ProductsContract.PersonEntry.COLUMN_BARCODE_ID, value);
    return this;
  }

  public ContentValues values() {
    return values;
  }
}
