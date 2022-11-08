// 
// Decompiled by Procyon v0.6.0
// 

public final class p23 implements myd<Object>
{
    public final j23 C0;
    
    public p23(final j23 c0) {
        zzd.f((Object)c0, "businessPhoneActionDispatcher");
        this.C0 = c0;
    }
    
    @Override
    public final boolean j() {
        this.C0.a.onNext((Object)m23.a.a);
        return true;
    }
}
