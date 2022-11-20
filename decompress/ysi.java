import android.view.LayoutInflater;
import android.app.Activity;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ysi implements ypa<ViewGroup, xsi>
{
    public final Activity a;
    public final krm b;
    public final efv c;
    public final rfm d;
    public final LayoutInflater e;
    public final asi f;
    public final kqi g;
    public final id6 h;
    public final vk3 i;
    public final dua<cxs> j;
    public final rv1 k;
    
    public ysi(final krm b, final Activity a, final efv c, final LayoutInflater e, final rfm d, final asi f, final kqi g, final id6 h, final vk3 i, final dua<cxs> j, final rv1 k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final /* bridge */ Object a(final Object o) {
        return this.f((ViewGroup)o);
    }
    
    public final xsi f(final ViewGroup viewGroup) {
        return new xsi(this.f, this.g, this.h, this.i, new vsi(this.a, this.b, this.c, viewGroup, this.e, this.d, this.k), (dua)this.j);
    }
}
