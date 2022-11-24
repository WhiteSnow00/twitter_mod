// 
// Decompiled by Procyon v0.6.0
// 

public abstract class tp0
{
    public static tp0 c() {
        final Integer value = 1;
        final Boolean false = Boolean.FALSE;
        if (value != null && false != null) {
            return new d100(value, false);
        }
        final StringBuilder sb = new StringBuilder();
        if (value == null) {
            sb.append(" appUpdateType");
        }
        if (false == null) {
            sb.append(" allowAssetPackDeletion");
        }
        final String value2 = String.valueOf(sb);
        throw new IllegalStateException(m51.y(new StringBuilder(value2.length() + 28), "Missing required properties:", value2));
    }
    
    public abstract boolean a();
    
    public abstract int b();
}
