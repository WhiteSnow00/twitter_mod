// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public final class d extends BaseAdapter
{
    public e F0;
    public int G0;
    public boolean H0;
    public final boolean I0;
    public final LayoutInflater J0;
    public final int K0;
    
    public d(final e f0, final LayoutInflater j0, final boolean i0, final int k0) {
        this.G0 = -1;
        this.I0 = i0;
        this.J0 = j0;
        this.F0 = f0;
        this.K0 = k0;
        this.a();
    }
    
    public final void a() {
        final e f0 = this.F0;
        final g v = f0.v;
        if (v != null) {
            f0.j();
            final ArrayList j = f0.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                if (j.get(i) == v) {
                    this.G0 = i;
                    return;
                }
            }
        }
        this.G0 = -1;
    }
    
    public final g d(final int n) {
        ArrayList list;
        if (this.I0) {
            final e f0 = this.F0;
            f0.j();
            list = f0.j;
        }
        else {
            list = this.F0.m();
        }
        final int g0 = this.G0;
        int n2 = n;
        if (g0 >= 0 && (n2 = n) >= g0) {
            n2 = n + 1;
        }
        return (g)list.get(n2);
    }
    
    public final int getCount() {
        ArrayList list;
        if (this.I0) {
            final e f0 = this.F0;
            f0.j();
            list = f0.j;
        }
        else {
            list = this.F0.m();
        }
        if (this.G0 < 0) {
            return list.size();
        }
        return list.size() - 1;
    }
    
    public final /* bridge */ Object getItem(final int n) {
        return this.d(n);
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final boolean b = false;
        View inflate = view;
        if (view == null) {
            inflate = this.J0.inflate(this.K0, viewGroup, false);
        }
        final int b2 = this.d(n).b;
        final int n2 = n - 1;
        int b3;
        if (n2 >= 0) {
            b3 = this.d(n2).b;
        }
        else {
            b3 = b2;
        }
        final ListMenuItemView listMenuItemView = (ListMenuItemView)inflate;
        boolean groupDividerEnabled = b;
        if (this.F0.n()) {
            groupDividerEnabled = b;
            if (b2 != b3) {
                groupDividerEnabled = true;
            }
        }
        listMenuItemView.setGroupDividerEnabled(groupDividerEnabled);
        final j.a a = (j.a)inflate;
        if (this.H0) {
            listMenuItemView.setForceShowIcon(true);
        }
        a.d(this.d(n));
        return inflate;
    }
    
    public final void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}
