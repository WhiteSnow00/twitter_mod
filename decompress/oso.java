import android.content.ContentValues;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.content.ContentResolver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oso extends gj8
{
    public final Context d;
    public final ContentResolver e;
    public final String f;
    
    public oso(final Context d, final String f, final ContentResolver e, final PackageManager packageManager) {
        super(d, f, packageManager);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final String b() {
        return "samsung";
    }
    
    public final int c(final wg1 wg1) {
        if (super.c(wg1) != 1) {
            try {
                final Uri parse = Uri.parse("content://com.sec.badge/apps");
                final ContentValues contentValues = new ContentValues();
                contentValues.put("package", this.d.getPackageName());
                contentValues.put("class", this.f);
                contentValues.put("badgecount", Integer.valueOf(wg1.c));
                if (this.e.update(parse, contentValues, "package=? AND class=?", new String[] { this.d.getPackageName(), this.f }) == 0) {
                    this.e.insert(parse, contentValues);
                }
                return 1;
            }
            catch (final Exception ex) {
                return 2;
            }
            catch (final IllegalArgumentException ex2) {
                return 3;
            }
        }
        return 1;
    }
}
