package fr.free.nrw.commons;

import android.content.Context;

public interface ViewHolder<T> {
  void bindModel(Context context, T model);
}
