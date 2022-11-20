// 
// Decompiled by Procyon v0.6.0
// 

public final class udt
{
    public static final rlp<udt> s;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    
    static {
        udt.s = new udt.udt$b();
    }
    
    public udt(final udt.udt$a udt$a) {
        final String a = udt$a.a;
        final String s = "";
        String a2 = a;
        if (a == null) {
            a2 = "";
        }
        this.a = a2;
        String b;
        if ((b = udt$a.b) == null) {
            b = "";
        }
        this.b = b;
        String c;
        if ((c = udt$a.c) == null) {
            c = "";
        }
        this.c = c;
        String d;
        if ((d = udt$a.d) == null) {
            d = "";
        }
        this.d = d;
        String e;
        if ((e = udt$a.e) == null) {
            e = "";
        }
        this.e = e;
        String f;
        if ((f = udt$a.f) == null) {
            f = "";
        }
        this.f = f;
        String g;
        if ((g = udt$a.g) == null) {
            g = "";
        }
        this.g = g;
        final Boolean h = udt$a.h;
        final Boolean false = Boolean.FALSE;
        Boolean b2;
        if ((b2 = h) == null) {
            b2 = false;
        }
        this.h = b2;
        String i;
        if ((i = udt$a.i) == null) {
            i = "";
        }
        this.i = i;
        String j;
        if ((j = udt$a.j) == null) {
            j = "";
        }
        this.j = j;
        String k;
        if ((k = udt$a.k) == null) {
            k = "";
        }
        this.k = k;
        String l;
        if ((l = udt$a.l) == null) {
            l = "";
        }
        this.l = l;
        String m;
        if ((m = udt$a.m) == null) {
            m = "";
        }
        this.m = m;
        String n;
        if ((n = udt$a.n) == null) {
            n = "";
        }
        this.n = n;
        String o;
        if ((o = udt$a.o) == null) {
            o = "";
        }
        this.o = o;
        String p;
        if ((p = udt$a.p) == null) {
            p = "";
        }
        this.p = p;
        String q;
        if ((q = udt$a.q) == null) {
            q = "";
        }
        this.q = q;
        String r = udt$a.r;
        if (r == null) {
            r = s;
        }
        this.r = r;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && udt.class == o.getClass()) {
            final udt udt = (udt)o;
            if (this.h != udt.h || !c5j.a((Object)this.a, (Object)udt.a) || !c5j.a((Object)this.b, (Object)udt.b) || !c5j.a((Object)this.c, (Object)udt.c) || !c5j.a((Object)this.d, (Object)udt.d) || !c5j.a((Object)this.e, (Object)udt.e) || !c5j.a((Object)this.f, (Object)udt.f) || !c5j.a((Object)this.g, (Object)udt.g) || !c5j.a((Object)this.i, (Object)udt.i) || !c5j.a((Object)this.j, (Object)udt.j) || !c5j.a((Object)this.k, (Object)udt.k) || !c5j.a((Object)this.l, (Object)udt.l) || !c5j.a((Object)this.m, (Object)udt.m) || !c5j.a((Object)this.n, (Object)udt.n) || !c5j.a((Object)this.o, (Object)udt.o) || !c5j.a((Object)this.p, (Object)udt.p) || !c5j.a((Object)this.q, (Object)udt.q) || !c5j.a((Object)this.r, (Object)udt.r)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return hmg.f(this.r, hmg.f(this.q, hmg.f(this.p, hmg.f(this.o, hmg.f(this.n, hmg.f(this.m, hmg.f(this.l, hmg.f(this.k, hmg.f(this.j, hmg.f(this.i, hmg.f(this.g, hmg.f(this.f, hmg.f(this.e, hmg.f(this.d, hmg.f(this.c, hmg.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31) + (this.h ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("TipJarSettings{isEnabled=");
        j.append(this.h);
        j.append(", handleBandcamp='");
        toe.j(j, this.a, '\'', ", bitcoinAddress='");
        toe.j(j, this.b, '\'', ", handleCashApp='");
        toe.j(j, this.c, '\'', ", handleChipper='");
        toe.j(j, this.d, '\'', ", ethereumAddress='");
        toe.j(j, this.e, '\'', ", handleFlutterwave='");
        toe.j(j, this.f, '\'', ", handleGoFundMe='");
        toe.j(j, this.g, '\'', ", handlePaga='");
        toe.j(j, this.i, '\'', ", handlePatreon='");
        toe.j(j, this.j, '\'', ", handlePayPal='");
        toe.j(j, this.k, '\'', ", handlePaytm='");
        toe.j(j, this.l, '\'', ", handlePicPay='");
        toe.j(j, this.m, '\'', ", handleRazorpay='");
        toe.j(j, this.n, '\'', ", handleStrike='");
        toe.j(j, this.o, '\'', ", handleVenmo='");
        toe.j(j, this.p, '\'', ", handleWealthsimple='");
        toe.j(j, this.q, '\'', ", handleKakaoPay='");
        j.append(this.r);
        j.append('\'');
        j.append('}');
        return j.toString();
    }
}
