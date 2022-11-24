// 
// Decompiled by Procyon v0.6.0
// 

public final class vdg
{
    public static final vdg b;
    public final cfg<String, udg> a;
    
    static {
        b = new vdg();
    }
    
    public vdg() {
        this.a = new cfg<String, udg>(20);
    }
    
    public final void a(final String s, final udg udg) {
        if (s == null) {
            return;
        }
        this.a.d(s, udg);
    }
}
