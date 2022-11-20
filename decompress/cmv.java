import android.util.AttributeSet;
import android.graphics.Shader;
import android.content.res.Resources;
import android.util.Log;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmv
{
    public static int a(final Context context, final int n, final int n2) {
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n, typedValue, true);
        if (typedValue.resourceId != 0) {
            return n;
        }
        return n2;
    }
    
    public static boolean b(final TypedArray typedArray) {
        return typedArray.getBoolean(2, typedArray.getBoolean(2, true));
    }
    
    public static boolean c(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final boolean b) {
        if (!n(xmlPullParser, s)) {
            return b;
        }
        return typedArray.getBoolean(n, b);
    }
    
    public static int d(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!n(xmlPullParser, s)) {
            return 0;
        }
        return typedArray.getColor(n, 0);
    }
    
    public static ColorStateList e(final TypedArray typedArray, XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) {
        final boolean n = n(xmlPullParser, "tint");
        xmlPullParser = null;
        if (!n) {
            return null;
        }
        final TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        final int type = typedValue.type;
        if (type == 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve attribute at index ");
            sb.append(1);
            sb.append(": ");
            sb.append(typedValue);
            throw new UnsupportedOperationException(sb.toString());
        }
        if (type >= 28 && type <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        final Resources resources = typedArray.getResources();
        final int resourceId = typedArray.getResourceId(1, 0);
        final ThreadLocal a = ar4.a;
        Object a2;
        try {
            a2 = ar4.a(resources, (XmlPullParser)resources.getXml(resourceId), resources$Theme);
        }
        catch (final Exception ex) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", (Throwable)ex);
            a2 = xmlPullParser;
        }
        return (ColorStateList)a2;
    }
    
    public static k06 f(final TypedArray typedArray, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme, final String s, int resourceId) {
        if (n(xmlPullParser, s)) {
            final TypedValue typedValue = new TypedValue();
            typedArray.getValue(resourceId, typedValue);
            final int type = typedValue.type;
            if (type >= 28 && type <= 31) {
                return new k06(null, null, typedValue.data);
            }
            final Resources resources = typedArray.getResources();
            resourceId = typedArray.getResourceId(resourceId, 0);
            k06 a;
            try {
                a = k06.a(resources, resourceId, resources$Theme);
            }
            catch (final Exception ex) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", (Throwable)ex);
                a = null;
            }
            if (a != null) {
                return a;
            }
        }
        return new k06(null, null, 0);
    }
    
    public static float g(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final float n2) {
        if (!n(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getFloat(n, n2);
    }
    
    public static int h(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final int n2) {
        if (!n(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getInt(n, n2);
    }
    
    public static int i(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!n(xmlPullParser, s)) {
            return 0;
        }
        return typedArray.getResourceId(n, 0);
    }
    
    public static String j(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!n(xmlPullParser, s)) {
            return null;
        }
        return typedArray.getString(n);
    }
    
    public static int k(final TypedArray typedArray) {
        return typedArray.getResourceId(22, typedArray.getResourceId(0, 0));
    }
    
    public static String l(final TypedArray typedArray, final int n, final int n2) {
        String s;
        if ((s = typedArray.getString(n)) == null) {
            s = typedArray.getString(n2);
        }
        return s;
    }
    
    public static CharSequence[] m(final TypedArray typedArray, final int n, final int n2) {
        CharSequence[] array;
        if ((array = typedArray.getTextArray(n)) == null) {
            array = typedArray.getTextArray(n2);
        }
        return array;
    }
    
    public static boolean n(final XmlPullParser xmlPullParser, final String s) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", s) != null;
    }
    
    public static TypedArray o(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final int[] array) {
        if (resources$Theme == null) {
            return resources.obtainAttributes(set, array);
        }
        return resources$Theme.obtainStyledAttributes(set, array, 0, 0);
    }
}
