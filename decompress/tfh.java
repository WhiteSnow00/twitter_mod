// 
// Decompiled by Procyon v0.6.0
// 

public final class tfh extends gue implements rtb<Boolean, Integer>
{
    public static final tfh C0;
    
    static {
        C0 = new tfh();
    }
    
    public tfh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Boolean b = (Boolean)o;
        zzd.f((Object)b, "isValid");
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
