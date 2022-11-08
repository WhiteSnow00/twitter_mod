// 
// Decompiled by Procyon v0.6.0
// 

public final class osx extends gue implements rtb<bsx, String>
{
    public static final osx C0;
    
    static {
        C0 = new osx();
    }
    
    public osx() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final bsx bsx = (bsx)o;
        zzd.f((Object)bsx, "spec");
        String s;
        if (bsx.d()) {
            s = "Periodic";
        }
        else {
            s = "OneTime";
        }
        return s;
    }
}
