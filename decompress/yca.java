// 
// Decompiled by Procyon v0.6.0
// 

public abstract class yca
{
    public static final xa1 a;
    
    static {
        final Long value = 10485760L;
        final Integer value2 = 200;
        final Integer value3 = 10000;
        final Long value4 = 604800000L;
        final Integer value5 = 81920;
        String s;
        if (value == null) {
            s = " maxStorageSizeInBytes";
        }
        else {
            s = "";
        }
        String h = s;
        if (value2 == null) {
            h = hmg.h(s, " loadBatchSize");
        }
        String h2 = h;
        if (value3 == null) {
            h2 = hmg.h(h, " criticalSectionEnterTimeoutMs");
        }
        String h3 = h2;
        if (value4 == null) {
            h3 = hmg.h(h2, " eventCleanUpAge");
        }
        String h4 = h3;
        if (value5 == null) {
            h4 = hmg.h(h3, " maxBlobByteSizePerRow");
        }
        if (h4.isEmpty()) {
            a = new xa1((long)value, (int)value2, (int)value3, (long)value4, (int)value5);
            return;
        }
        throw new IllegalStateException(hmg.h("Missing required properties:", h4));
    }
    
    public abstract int a();
    
    public abstract long b();
    
    public abstract int c();
    
    public abstract int d();
    
    public abstract long e();
}
