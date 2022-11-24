import android.content.ContentValues;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import android.content.ContentResolver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d0j implements qve
{
    public final Context a;
    public final ContentResolver b;
    public final String c;
    
    public d0j(final Context a, final ContentResolver b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean a(final UserIdentifier userIdentifier) {
        return mqb.f((qve)this, userIdentifier);
    }
    
    @Override
    public final String b() {
        return "nova";
    }
    
    @Override
    public final int c(final wg1 wg1) {
        final Uri parse = Uri.parse("content://com.teslacoilsw.notifier/unread_count");
        try {
            final ContentValues contentValues = new ContentValues();
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a.getPackageName());
            sb.append("/");
            sb.append(this.c);
            contentValues.put("tag", sb.toString());
            contentValues.put("count", Integer.valueOf(wg1.c));
            this.b.insert(parse, contentValues);
            return 1;
        }
        catch (final Exception ex) {
            return 2;
        }
        catch (final IllegalArgumentException ex2) {
            return 3;
        }
    }
    
    @Override
    public final String d() {
        return null;
    }
}
