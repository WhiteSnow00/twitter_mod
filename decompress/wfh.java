// 
// Decompiled by Procyon v0.6.0
// 

public final class wfh extends ste implements qsb<Boolean, Integer>
{
    public static final wfh D0;
    
    static {
        D0 = new wfh();
    }
    
    public wfh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Boolean b = (Boolean)o;
        czd.f((Object)b, "isValid");
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 3;
        }
        return n;
    }
}
