import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dl4 extends ste implements nsb<fzv>
{
    public final obi<?> D0;
    public final hv8 E0;
    
    public dl4(final obi<?> d0, final hv8 e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        final obi<?> d0 = this.D0;
        final Uri parse = Uri.parse("http://help.twitter.com/using-twitter/cotweets");
        czd.e((Object)parse, "parse(ABOUT_CO_TWEET)");
        d0.d((ym)new vmx(parse));
        wc0.b(this.E0, (mw8)null, (Object)null, 3, (Object)null);
        return fzv.a;
    }
}
