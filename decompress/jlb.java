import android.util.Base64;
import java.util.Collections;
import java.util.List;
import java.io.IOException;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParserException;
import java.util.ArrayList;
import android.util.Xml;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlb
{
    public static b a(final XmlPullParser xmlPullParser, final Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
        } while (next != 2 && next != 1);
        if (next == 2) {
            xmlPullParser.require(2, (String)null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), xd.N0);
                final String string = obtainAttributes.getString(0);
                final String string2 = obtainAttributes.getString(4);
                final String string3 = obtainAttributes.getString(5);
                final int resourceId = obtainAttributes.getResourceId(1, 0);
                final int integer = obtainAttributes.getInteger(2, 1);
                final int integer2 = obtainAttributes.getInteger(3, 500);
                final String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlPullParser.next() != 3) {
                        c(xmlPullParser);
                    }
                    final Object o = new jlb.jlb$e(new clb(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
                    return (b)o;
                }
                final ArrayList list = new ArrayList();
                while (xmlPullParser.next() != 3) {
                    if (xmlPullParser.getEventType() != 2) {
                        continue;
                    }
                    if (xmlPullParser.getName().equals("font")) {
                        final TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), xd.O0);
                        int n = 8;
                        if (!obtainAttributes2.hasValue(8)) {
                            n = 1;
                        }
                        final int int1 = obtainAttributes2.getInt(n, 400);
                        int n2;
                        if (obtainAttributes2.hasValue(6)) {
                            n2 = 6;
                        }
                        else {
                            n2 = 2;
                        }
                        final boolean b = 1 == obtainAttributes2.getInt(n2, 0);
                        int n3 = 9;
                        if (!obtainAttributes2.hasValue(9)) {
                            n3 = 3;
                        }
                        int n4 = 7;
                        if (!obtainAttributes2.hasValue(7)) {
                            n4 = 4;
                        }
                        final String string5 = obtainAttributes2.getString(n4);
                        final int int2 = obtainAttributes2.getInt(n3, 0);
                        int n5;
                        if (obtainAttributes2.hasValue(5)) {
                            n5 = 5;
                        }
                        else {
                            n5 = 0;
                        }
                        final int resourceId2 = obtainAttributes2.getResourceId(n5, 0);
                        final String string6 = obtainAttributes2.getString(n5);
                        obtainAttributes2.recycle();
                        while (xmlPullParser.next() != 3) {
                            c(xmlPullParser);
                        }
                        list.add(new d(string6, int1, b, string5, int2, resourceId2));
                    }
                    else {
                        c(xmlPullParser);
                    }
                }
                if (!list.isEmpty()) {
                    final Object o = new jlb.jlb$c((d[])list.toArray(new d[0]));
                    return (b)o;
                }
            }
            else {
                c(xmlPullParser);
            }
            final Object o = null;
            return (b)o;
        }
        throw new XmlPullParserException("No start tag found");
    }
    
    public static List<List<byte[]>> b(final Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        final TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            final ArrayList<List<byte[]>> list = new ArrayList<List<byte[]>>();
            if (a.a(obtainTypedArray, 0) == 1) {
                int resourceId;
                for (i = 0; i < obtainTypedArray.length(); ++i) {
                    resourceId = obtainTypedArray.getResourceId(i, 0);
                    if (resourceId != 0) {
                        list.add(d(resources.getStringArray(resourceId)));
                    }
                }
            }
            else {
                list.add(d(resources.getStringArray(i)));
            }
            return list;
        }
        finally {
            obtainTypedArray.recycle();
        }
    }
    
    public static void c(final XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            final int next = xmlPullParser.next();
            if (next != 2) {
                if (next != 3) {
                    continue;
                }
                --i;
            }
            else {
                ++i;
            }
        }
    }
    
    public static List<byte[]> d(final String[] array) {
        final ArrayList list = new ArrayList();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(Base64.decode(array[i], 0));
        }
        return list;
    }
    
    public static final class a
    {
        public static int a(final TypedArray typedArray, final int n) {
            return typedArray.getType(n);
        }
    }
    
    public interface b
    {
    }
    
    public static final class d
    {
        public final String a;
        public final int b;
        public final boolean c;
        public final String d;
        public final int e;
        public final int f;
        
        public d(final String a, final int b, final boolean c, final String d, final int e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
}
