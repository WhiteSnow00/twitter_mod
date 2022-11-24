import android.util.Log;
import java.util.Arrays;
import android.os.Build$VERSION;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oa7
{
    public static int a(final Cursor cursor, final String s) {
        final int columnIndex = cursor.getColumnIndex(s);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("`");
        sb.append(s);
        sb.append("`");
        final int columnIndex2 = cursor.getColumnIndex(sb.toString());
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n = -1;
        int n2;
        if (sdk_INT > 25) {
            n2 = n;
        }
        else if (s.length() == 0) {
            n2 = n;
        }
        else {
            final String[] columnNames = cursor.getColumnNames();
            final String l = mqb.l(".", s);
            final String h = c0e.h(".", s, "`");
            int n3 = 0;
            while (true) {
                n2 = n;
                if (n3 >= columnNames.length) {
                    return n2;
                }
                final String s2 = columnNames[n3];
                if (s2.length() >= s.length() + 2) {
                    if (s2.endsWith(l)) {
                        break;
                    }
                    if (s2.charAt(0) == '`' && s2.endsWith(h)) {
                        break;
                    }
                }
                ++n3;
            }
            n2 = n3;
        }
        return n2;
    }
    
    public static int b(final Cursor cursor, final String s) {
        final int a = a(cursor, s);
        if (a >= 0) {
            return a;
        }
        String string;
        try {
            string = Arrays.toString(cursor.getColumnNames());
        }
        catch (final Exception ex) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", (Throwable)ex);
            string = "";
        }
        throw new IllegalArgumentException(bj.z("column '", s, "' does not exist. Available columns: ", string));
    }
}
