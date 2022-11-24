import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f7i implements rbq<String, wow>
{
    public final Resources F0;
    
    public f7i(final Resources f0) {
        this.F0 = f0;
    }
    
    @Override
    public final mpg F(final stb stb) {
        return qee.e((rbq)this, stb);
    }
    
    @Override
    public final bbq S(final Object o) {
        final String s = (String)o;
        final String trim = s.trim();
        final int f = ita.b().f("user_display_name_max_limit", this.F0.getInteger(2131492951));
        bbq bbq;
        if (flr.e((CharSequence)trim)) {
            bbq = bbq.v((Object)new wow(3, this.F0.getString(2131958083)));
        }
        else if (flr.a(trim, "twitter")) {
            bbq = bbq.v((Object)new wow(3, this.F0.getString(2131958082)));
        }
        else if (flr.d(s) > f) {
            bbq = bbq.v((Object)new wow(3, this.F0.getString(2131958084, new Object[] { f })));
        }
        else {
            bbq = bbq.v((Object)new wow(2, (String)null));
        }
        return bbq;
    }
    
    public final void close() {
    }
    
    @Override
    public final mpg n1(final k9x k9x) {
        return qee.h((rbq)this, k9x);
    }
    
    @Override
    public final rbq o(final j5s j5s) {
        return qee.p((rbq)this, j5s);
    }
    
    @Override
    public final rbq p(final stb stb) {
        return qee.m((rbq)this, stb);
    }
    
    @Override
    public final x6j y0(final x6j x6j, final bx0 bx0) {
        return qee.n((rbq)this, x6j, bx0);
    }
}
