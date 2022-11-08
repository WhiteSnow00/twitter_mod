// 
// Decompiled by Procyon v0.6.0
// 

public final class dor extends gue implements rtb<Integer, CharSequence>
{
    public static final dor C0;
    
    static {
        C0 = new dor();
    }
    
    public dor() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        return String.valueOf((char)((Number)o).intValue());
    }
}
