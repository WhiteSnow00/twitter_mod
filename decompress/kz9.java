import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kz9 extends rj8<String, pd1>
{
    public final String c;
    
    public kz9(final Locale locale) {
        super(pd1.class, "email_availability_check");
        this.c = jgw.H(locale);
    }
    
    public final int g() {
        return 2;
    }
    
    @Override
    public final void i(final qrc.a a, final Object o) {
        final String s = (String)o;
        a.n("/i/users/email_available.json", "/");
        final int a2 = w4j.a;
        a.d("email", s);
        a.d("lang", this.c);
    }
}
