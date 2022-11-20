// 
// Decompiled by Procyon v0.6.0
// 

public final class oko extends ste implements qsb<qdb, Boolean>
{
    public final qsb<pko, Boolean> D0;
    
    public oko(final qsb<? super pko, Boolean> d0) {
        this.D0 = (qsb<pko, Boolean>)d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qdb qdb = (qdb)o;
        czd.f((Object)qdb, "e");
        if (qdb instanceof pko) {
            return this.D0.invoke((Object)qdb);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
