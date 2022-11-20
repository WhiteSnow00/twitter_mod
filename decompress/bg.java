// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bg implements gg
{
    public String a;
    public final int[] b;
    
    public bg() {
        this.b = new int[2];
    }
    
    public final int[] c(final int n, final int n2) {
        if (n >= 0 && n2 >= 0 && n != n2) {
            final int[] b = this.b;
            b[0] = n;
            b[1] = n2;
            return b;
        }
        return null;
    }
    
    public final String d() {
        final String a = this.a;
        if (a != null) {
            return a;
        }
        czd.m("text");
        throw null;
    }
    
    public void e(final String a) {
        czd.f((Object)a, "text");
        this.a = a;
    }
}
