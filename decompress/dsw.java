// 
// Decompiled by Procyon v0.6.0
// 

public final class dsw extends aj8<String, esw>
{
    public dsw() {
        super((Class)esw.class, "verification_status");
    }
    
    public final int g() {
        return 2;
    }
    
    public final void i(final tqc$a tqc$a, final Object o) {
        final String s = (String)o;
        tqc$a.n("/1.1/onboarding/verification_status.json", "/");
        final int a = c5j.a;
        tqc$a.d("email", s);
    }
}
