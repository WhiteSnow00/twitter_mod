// 
// Decompiled by Procyon v0.6.0
// 

public final class vrz implements urz
{
    public static final tcz a;
    public static final tcz b;
    public static final tcz c;
    public static final tcz d;
    public static final tcz e;
    public static final tcz f;
    
    static {
        final edz edz = new edz(icz.a(), true, true);
        a = (tcz)edz.c("measurement.adid_zero.app_instance_id_fix", true);
        b = (tcz)edz.c("measurement.adid_zero.service", true);
        c = (tcz)edz.c("measurement.adid_zero.adid_uid", true);
        d = (tcz)edz.c("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        e = (tcz)edz.c("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        f = (tcz)edz.c("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }
    
    public final void a() {
    }
    
    public final boolean c() {
        return (boolean)((mdz)vrz.a).b();
    }
    
    public final boolean d() {
        return (boolean)((mdz)vrz.b).b();
    }
    
    public final boolean e() {
        return (boolean)((mdz)vrz.c).b();
    }
    
    public final boolean f() {
        return (boolean)((mdz)vrz.d).b();
    }
    
    public final boolean g() {
        return (boolean)((mdz)vrz.e).b();
    }
    
    public final boolean i() {
        return (boolean)((mdz)vrz.f).b();
    }
}
