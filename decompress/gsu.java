// 
// Decompiled by Procyon v0.6.0
// 

public final class gsu extends gue implements gub<snj<hfv>, k2c, gvj<? extends snj<hfv>, ? extends k2c>>
{
    public static final gsu C0;
    
    static {
        C0 = new gsu();
    }
    
    public gsu() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final snj snj = (snj)o;
        final k2c k2c = (k2c)o2;
        zzd.f((Object)snj, "fetchedUser");
        zzd.f((Object)k2c, "friendship");
        return new gvj((Object)snj, (Object)k2c);
    }
}
