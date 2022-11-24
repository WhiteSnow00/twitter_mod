import android.content.ContentValues;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyp
{
    public static final String[] e;
    public final nyp a;
    public final m00 b;
    public final a10 c;
    public final kfw d;
    
    static {
        e = new String[] { "log", "request_id", "retry_count" };
    }
    
    public kyp(final nyp a, final m00 b, final a10 c, final kfw d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final ContentValues contentValues = new ContentValues();
        contentValues.put("request_id", String.valueOf(0));
        a.P((aqo)new eyp(contentValues));
    }
}
