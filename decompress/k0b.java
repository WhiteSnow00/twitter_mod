import java.util.Arrays;
import android.text.TextUtils;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k0b
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    
    public k0b(final String b, final String a, final String c, final String d, final String e, final String f, final String g) {
        eli.t(nkr.a(b) ^ true, "ApplicationId must be set.");
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static k0b a(final Context context) {
        final v2c v2c = new v2c(context);
        final String d = v2c.d("google_app_id");
        if (TextUtils.isEmpty((CharSequence)d)) {
            return null;
        }
        return new k0b(d, v2c.d("google_api_key"), v2c.d("firebase_database_url"), v2c.d("ga_trackingId"), v2c.d("gcm_defaultSenderId"), v2c.d("google_storage_bucket"), v2c.d("project_id"));
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof k0b;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final k0b k0b = (k0b)o;
        boolean b3 = b2;
        if (f5j.a(this.b, k0b.b)) {
            b3 = b2;
            if (f5j.a(this.a, k0b.a)) {
                b3 = b2;
                if (f5j.a(this.c, k0b.c)) {
                    b3 = b2;
                    if (f5j.a(this.d, k0b.d)) {
                        b3 = b2;
                        if (f5j.a(this.e, k0b.e)) {
                            b3 = b2;
                            if (f5j.a(this.f, k0b.f)) {
                                b3 = b2;
                                if (f5j.a(this.g, k0b.g)) {
                                    b3 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.a, this.c, this.d, this.e, this.f, this.g });
    }
    
    @Override
    public final String toString() {
        final f5j.a a = new f5j.a(this);
        a.a("applicationId", this.b);
        a.a("apiKey", this.a);
        a.a("databaseUrl", this.c);
        a.a("gcmSenderId", this.e);
        a.a("storageBucket", this.f);
        a.a("projectId", this.g);
        return a.toString();
    }
}
