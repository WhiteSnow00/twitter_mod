// 
// Decompiled by Procyon v0.6.0
// 

public final class zfs extends gue implements rtb<hgs, hr9>
{
    public static final zfs C0;
    
    static {
        C0 = new zfs();
    }
    
    public zfs() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hgs hgs = (hgs)o;
        zzd.f((Object)hgs, "$this$deleteIfSelectedOr");
        final Integer a = ((kq1)hgs).a();
        uo8 uo8;
        if (a != null) {
            uo8 = new uo8(0, a.intValue() - mis.d(((kq1)hgs).f));
        }
        else {
            uo8 = null;
        }
        return uo8;
    }
}
