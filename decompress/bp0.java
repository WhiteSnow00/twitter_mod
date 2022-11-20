// 
// Decompiled by Procyon v0.6.0
// 

public final class bp0 implements yjp
{
    public wil a;
    
    @Override
    public final boolean a(final no9 no9) {
        czd.f((Object)no9, "log");
        final String a = no9.a;
        final s9a a2 = s9a.a;
        if (!s9a.i.contains(wil.valueOf(a))) {
            return false;
        }
        this.a = wil.valueOf(a);
        return true;
    }
    
    @Override
    public final String b() {
        return "App Store Sequence";
    }
    
    @Override
    public final wil c() {
        return this.a;
    }
}
