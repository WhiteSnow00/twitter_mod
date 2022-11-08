import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnw
{
    public final ymw a;
    public final b5j<mnw> b;
    public String c;
    
    public dnw(final ymw a, final ymw ymw, final ibm ibm) {
        final dl8 dl8 = new dl8(yvo.a());
        final qvo l = h6q.L();
        this.a = a;
        final bnw bnw = (bnw)a;
        final b5j distinctUntilChanged = bnw.a().startWith((Object)bnw.e()).map((qtb)fkc.Q0).distinctUntilChanged();
        final bnw bnw2 = (bnw)ymw;
        final b5j observeOn = b5j.combineLatest((naj)distinctUntilChanged, (naj)bnw2.a().startWith((Object)bnw2.e()).map((qtb)psf.V0).distinctUntilChanged(), (ew1)new de3((Object)this, 1)).flatMap((qtb)new ue8((Object)dl8, 6)).startWith((Object)new mnw(0, (String)null)).distinctUntilChanged().compose((jbj)ngm.C0).observeOn(l);
        this.b = (b5j<mnw>)observeOn;
        final j29 subscribe = observeOn.subscribe((fk6)new y9f((Object)this, 9));
        Objects.requireNonNull(subscribe);
        ibm.i((rj)new c41(subscribe, 7));
    }
}
