import com.twitter.rooms.ui.core.history.a$a$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmn extends ste implements qsb<a$a$a, fzv>
{
    public final w19 D0;
    public final omn E0;
    public final hmn F0;
    
    public pmn(final w19 d0, final omn e0, final hmn f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final a$a$a a$a$a = (a$a$a)o;
        this.E0.H0.onNext((Object)((hmn.c)this.F0).a.a);
        this.D0.a();
        return fzv.a;
    }
}
