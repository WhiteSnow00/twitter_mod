import java.util.concurrent.TimeUnit;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnw
{
    public final daq<String, mnw> a;
    public final ymw b;
    public final b5j<mnw> c;
    public final qvo d;
    
    public gnw(final daq<String, mnw> daq, final ymw ymw, final ibm ibm) {
        this(daq, ymw, (jnw)new dl8(yvo.a()), h6q.L(), yvo.a(), ibm);
    }
    
    public gnw(final daq<String, mnw> a, final ymw b, final jnw jnw, final qvo qvo, final qvo d, final ibm ibm) {
        this.a = a;
        this.b = b;
        this.d = d;
        final b5j observeOn = b5j.switchOnNext((naj)b.a().startWith((Object)b.e().toString()).map((qtb)vqf.N0).map((qtb)new ly0((Object)b, 10)).distinctUntilChanged().map((qtb)new z5f(this, jnw, 1))).distinctUntilChanged().compose((jbj)ngm.C0).observeOn(qvo);
        this.c = (b5j<mnw>)observeOn;
        final j29 subscribe = observeOn.subscribe((fk6)new bf2((Object)this, 15));
        Objects.requireNonNull(subscribe);
        ibm.i((rj)new hjd(subscribe, 6));
    }
    
    public final b5j<mnw> a(final CharSequence charSequence) {
        if (pjr.g(charSequence)) {
            return (b5j<mnw>)b5j.just((Object)new mnw(1, (String)null)).delay(250L, TimeUnit.MILLISECONDS, this.d).mergeWith((ubq)this.a.S((Object)charSequence.toString())).takeUntil((ptk)qut.M0);
        }
        return (b5j<mnw>)b5j.just((Object)new mnw(0, (String)null));
    }
    
    public final void b(final mnw mnw) {
        ri4.V(mnw, this.b);
    }
}
