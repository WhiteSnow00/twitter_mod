// 
// Decompiled by Procyon v0.6.0
// 

public final class krw extends rj8<String, lrw>
{
    public krw() {
        super(lrw.class, "verification_status");
    }
    
    public final int g() {
        return 2;
    }
    
    @Override
    public final void i(final qrc.a a, final Object o) {
        final String s = (String)o;
        a.n("/1.1/onboarding/verification_status.json", "/");
        final int a2 = w4j.a;
        a.d("email", s);
    }
}
