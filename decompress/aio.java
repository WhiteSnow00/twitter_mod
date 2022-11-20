// 
// Decompiled by Procyon v0.6.0
// 

public final class aio extends ste implements qsb<Boolean, fzv>
{
    public final xho D0;
    
    public aio(final xho d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Boolean b = (Boolean)o;
        czd.e((Object)b, "captionsEnabled");
        if (b) {
            vjo.G(this.D0.a, "", "", "transcription", "impression", null, 48);
        }
        return fzv.a;
    }
}
