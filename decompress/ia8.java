import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import android.icu.util.TimeZone;
import android.icu.text.DateFormat;
import android.os.Build$VERSION;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ia8
{
    public static String a(final long n) {
        final Locale default1 = Locale.getDefault();
        String s;
        if (Build$VERSION.SDK_INT >= 24) {
            final AtomicReference a = cmw.a;
            final DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", default1);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            s = instanceForSkeleton.format(new Date(n));
        }
        else {
            final AtomicReference a2 = cmw.a;
            final java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, default1);
            dateInstance.setTimeZone(cmw.c());
            s = dateInstance.format(new Date(n));
        }
        return s;
    }
    
    public static String b(final long n) {
        final Locale default1 = Locale.getDefault();
        String s;
        if (Build$VERSION.SDK_INT >= 24) {
            final AtomicReference a = cmw.a;
            final DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEd", default1);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            s = instanceForSkeleton.format(new Date(n));
        }
        else {
            final AtomicReference a2 = cmw.a;
            final java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, default1);
            dateInstance.setTimeZone(cmw.c());
            s = dateInstance.format(new Date(n));
        }
        return s;
    }
}
