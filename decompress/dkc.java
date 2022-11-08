import com.twitter.android.liveevent.dock.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkc
{
    public final b a;
    public snj<String> b;
    public final j29 c;
    public boolean d;
    
    public dkc(final b a, final ym ym) {
        final snj b = snj.b;
        final int a2 = w4j.a;
        this.b = (snj<String>)b;
        this.d = false;
        this.a = a;
        this.c = ((b5j)ym.C0).distinctUntilChanged().filter((ptk)cc3.R0).map((qtb)ckc.D0).subscribe((fk6)new ocs((Object)this, 8));
    }
    
    public final boolean a() {
        return this.b.f() && this.a.d((String)this.b.c());
    }
}
