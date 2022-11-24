import android.view.ViewStructure;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wc1
{
    public static final wc1 a;
    
    static {
        a = new wc1();
    }
    
    public final int a(final ViewStructure viewStructure, final int n) {
        e0e.f((Object)viewStructure, "structure");
        return viewStructure.addChildCount(n);
    }
    
    public final ViewStructure b(final ViewStructure viewStructure, final int n) {
        e0e.f((Object)viewStructure, "structure");
        return viewStructure.newChild(n);
    }
    
    public final void c(final ViewStructure viewStructure, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        e0e.f((Object)viewStructure, "structure");
        viewStructure.setDimens(n, n2, n3, n4, n5, n6);
    }
    
    public final void d(final ViewStructure viewStructure, final int n, final String s, final String s2, final String s3) {
        e0e.f((Object)viewStructure, "structure");
        viewStructure.setId(n, s, s2, s3);
    }
}
