package ru.rsue.spirinkirill;



import androidx.fragment.app.Fragment;

import ru.rsue.spirinkirill.BookDepository.SingleFragmentActivity;

public class BookListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new BookListFragment();
    }
}
