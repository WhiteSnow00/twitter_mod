// 
// Decompiled by Procyon v0.6.0
// 

public final class ako extends gue implements rtb<seb, Boolean>
{
    public final /* synthetic */ rtb<bko, Boolean> C0;
    
    public ako(final rtb<? super bko, Boolean> c0) {
        this.C0 = (rtb<bko, Boolean>)c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final seb seb = (seb)o;
        zzd.f((Object)seb, "e");
        if (seb instanceof bko) {
            return this.C0.invoke((Object)seb);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
