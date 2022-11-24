import java.util.Arrays;
import android.text.TextUtils;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m1b
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    
    public m1b(final String b, final String a, final String c, final String d, final String e, final String f, final String g) {
        iuk.H(klr.a(b) ^ true, (Object)"ApplicationId must be set.");
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static m1b a(final Context context) {
        final clr clr = new clr(context);
        final String e = clr.e("google_app_id");
        if (TextUtils.isEmpty((CharSequence)e)) {
            return null;
        }
        return new m1b(e, clr.e("google_api_key"), clr.e("firebase_database_url"), clr.e("ga_trackingId"), clr.e("gcm_defaultSenderId"), clr.e("google_storage_bucket"), clr.e("project_id"));
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof m1b;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final m1b m1b = (m1b)o;
        boolean b3 = b2;
        if (r5j.a(this.b, m1b.b)) {
            b3 = b2;
            if (r5j.a(this.a, m1b.a)) {
                b3 = b2;
                if (r5j.a(this.c, m1b.c)) {
                    b3 = b2;
                    if (r5j.a(this.d, m1b.d)) {
                        b3 = b2;
                        if (r5j.a(this.e, m1b.e)) {
                            b3 = b2;
                            if (r5j.a(this.f, m1b.f)) {
                                b3 = b2;
                                if (r5j.a(this.g, m1b.g)) {
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
        final r5j.a a = new r5j.a(this);
        a.a("applicationId", this.b);
        a.a("apiKey", this.a);
        a.a("databaseUrl", this.c);
        a.a("gcmSenderId", this.e);
        a.a("storageBucket", this.f);
        a.a("projectId", this.g);
        return a.toString();
    }
}
