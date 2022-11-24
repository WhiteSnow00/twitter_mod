import android.content.res.Resources;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p7g implements gra<ViewGroup, o7g>
{
    public final Resources a;
    public final s7g b;
    public final boolean c;
    
    public p7g(final Resources a, final s7g b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final Object o) {
        return new q7g(this.a, this.b.f((ViewGroup)o), this.c);
    }
}
