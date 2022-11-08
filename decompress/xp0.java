// 
// Decompiled by Procyon v0.6.0
// 

public abstract class xp0
{
    public static xp0 c() {
        final Integer value = 1;
        final Boolean false = Boolean.FALSE;
        if (value != null && false != null) {
            return new szz(value, false);
        }
        final StringBuilder sb = new StringBuilder();
        if (value == null) {
            sb.append(" appUpdateType");
        }
        if (false == null) {
            sb.append(" allowAssetPackDeletion");
        }
        final String value2 = String.valueOf(sb);
        throw new IllegalStateException(hi.I(new StringBuilder(value2.length() + 28), "Missing required properties:", value2));
    }
    
    public abstract boolean a();
    
    public abstract int b();
}
