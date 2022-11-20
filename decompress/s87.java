import android.database.DataSetObserver;
import android.database.ContentObserver;
import android.widget.Filter;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.database.Cursor;
import android.widget.Filterable;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class s87 extends BaseAdapter implements Filterable, v87$a
{
    public boolean D0;
    public boolean E0;
    public Cursor F0;
    public Context G0;
    public int H0;
    public s87.s87$a I0;
    public s87.s87$b J0;
    public v87 K0;
    
    public s87(final Context context) {
        this.h(context, 1);
    }
    
    public s87(final Context context, final Cursor cursor, final int n) {
        this.h(context, 0);
    }
    
    public void a(Cursor k) {
        k = this.k(k);
        if (k != null) {
            k.close();
        }
    }
    
    public CharSequence d(final Cursor cursor) {
        String string;
        if (cursor == null) {
            string = "";
        }
        else {
            string = cursor.toString();
        }
        return string;
    }
    
    public Cursor e(final CharSequence charSequence) {
        return this.F0;
    }
    
    public abstract void g(final View p0, final Cursor p1);
    
    public int getCount() {
        if (this.D0) {
            final Cursor f0 = this.F0;
            if (f0 != null) {
                return f0.getCount();
            }
        }
        return 0;
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        if (this.D0) {
            this.F0.moveToPosition(n);
            View i;
            if ((i = view) == null) {
                i = this.i(this.G0, this.F0, viewGroup);
            }
            this.g(i, this.F0);
            return i;
        }
        return null;
    }
    
    public final Filter getFilter() {
        if (this.K0 == null) {
            this.K0 = new v87((v87$a)this);
        }
        return (Filter)this.K0;
    }
    
    public final Object getItem(final int n) {
        if (this.D0) {
            final Cursor f0 = this.F0;
            if (f0 != null) {
                f0.moveToPosition(n);
                return this.F0;
            }
        }
        return null;
    }
    
    public final long getItemId(final int n) {
        if (this.D0) {
            final Cursor f0 = this.F0;
            if (f0 != null && f0.moveToPosition(n)) {
                return this.F0.getLong(this.H0);
            }
        }
        return 0L;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (!this.D0) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.F0.moveToPosition(n)) {
            View j;
            if ((j = view) == null) {
                j = this.j(this.G0, viewGroup);
            }
            this.g(j, this.F0);
            return j;
        }
        throw new IllegalStateException(udu.z("couldn't move cursor to position ", n));
    }
    
    public final void h(final Context g0, int n) {
        if ((n & 0x1) == 0x1) {
            n |= 0x2;
            this.E0 = true;
        }
        else {
            this.E0 = false;
        }
        this.F0 = null;
        this.D0 = false;
        this.G0 = g0;
        this.H0 = -1;
        if ((n & 0x2) == 0x2) {
            this.I0 = new s87.s87$a(this);
            this.J0 = new s87.s87$b(this);
        }
        else {
            this.I0 = null;
            this.J0 = null;
        }
    }
    
    public boolean hasStableIds() {
        return this instanceof yur ^ true;
    }
    
    public View i(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.j(context, viewGroup);
    }
    
    public abstract View j(final Context p0, final ViewGroup p1);
    
    public final Cursor k(final Cursor f0) {
        final Cursor f2 = this.F0;
        if (f0 == f2) {
            return null;
        }
        if (f2 != null) {
            final s87.s87$a i0 = this.I0;
            if (i0 != null) {
                f2.unregisterContentObserver((ContentObserver)i0);
            }
            final s87.s87$b j0 = this.J0;
            if (j0 != null) {
                f2.unregisterDataSetObserver((DataSetObserver)j0);
            }
        }
        if ((this.F0 = f0) != null) {
            final s87.s87$a i2 = this.I0;
            if (i2 != null) {
                f0.registerContentObserver((ContentObserver)i2);
            }
            final s87.s87$b j2 = this.J0;
            if (j2 != null) {
                f0.registerDataSetObserver((DataSetObserver)j2);
            }
            this.H0 = f0.getColumnIndexOrThrow("_id");
            this.D0 = true;
            this.notifyDataSetChanged();
        }
        else {
            this.H0 = -1;
            this.D0 = false;
            this.notifyDataSetInvalidated();
        }
        return f2;
    }
}
