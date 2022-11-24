import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.Xml;
import java.util.ArrayList;
import android.util.Log;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import androidx.constraintlayout.widget.b;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oj6
{
    public final ConstraintLayout a;
    public int b;
    public int c;
    public SparseArray<a> d;
    public SparseArray<androidx.constraintlayout.widget.b> e;
    
    public oj6(final Context context, final ConstraintLayout a, int n) {
        this.b = -1;
        this.c = -1;
        this.d = (SparseArray<a>)new SparseArray();
        this.e = (SparseArray<androidx.constraintlayout.widget.b>)new SparseArray();
        this.a = a;
        final XmlResourceParser xml = context.getResources().getXml(n);
        a a2 = null;
        try {
            n = ((XmlPullParser)xml).getEventType();
            while (true) {
                final int n2 = 1;
                if (n == 1) {
                    break;
                }
                a a3;
                if (n != 0) {
                    if (n != 2) {
                        a3 = a2;
                    }
                    else {
                        final String name = ((XmlPullParser)xml).getName();
                        Label_0229: {
                            switch (name.hashCode()) {
                                case 1901439077: {
                                    if (name.equals("Variant")) {
                                        n = 3;
                                        break Label_0229;
                                    }
                                    break;
                                }
                                case 1657696882: {
                                    if (name.equals("layoutDescription")) {
                                        n = 0;
                                        break Label_0229;
                                    }
                                    break;
                                }
                                case 1382829617: {
                                    if (name.equals("StateSet")) {
                                        n = n2;
                                        break Label_0229;
                                    }
                                    break;
                                }
                                case 80204913: {
                                    if (name.equals("State")) {
                                        n = 2;
                                        break Label_0229;
                                    }
                                    break;
                                }
                                case -1349929691: {
                                    if (name.equals("ConstraintSet")) {
                                        n = 4;
                                        break Label_0229;
                                    }
                                    break;
                                }
                            }
                            n = -1;
                        }
                        if (n != 2) {
                            if (n != 3) {
                                if (n != 4) {
                                    a3 = a2;
                                }
                                else {
                                    this.a(context, (XmlPullParser)xml);
                                    a3 = a2;
                                }
                            }
                            else {
                                final b b = new b(context, (XmlPullParser)xml);
                                if ((a3 = a2) != null) {
                                    a2.b.add(b);
                                    a3 = a2;
                                }
                            }
                        }
                        else {
                            a3 = new a(context, (XmlPullParser)xml);
                            this.d.put(a3.a, (Object)a3);
                        }
                    }
                }
                else {
                    ((XmlPullParser)xml).getName();
                    a3 = a2;
                }
                n = ((XmlPullParser)xml).next();
                a2 = a3;
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        catch (final XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    public final void a(final Context context, final XmlPullParser xmlPullParser) {
        final androidx.constraintlayout.widget.b b = new androidx.constraintlayout.widget.b();
        for (int attributeCount = xmlPullParser.getAttributeCount(), i = 0; i < attributeCount; ++i) {
            final String attributeName = xmlPullParser.getAttributeName(i);
            final String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null) {
                if (attributeValue != null) {
                    if ("id".equals(attributeName)) {
                        int identifier;
                        if (attributeValue.contains("/")) {
                            identifier = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                        }
                        else {
                            identifier = -1;
                        }
                        int int1 = identifier;
                        if (identifier == -1) {
                            if (attributeValue.length() > 1) {
                                int1 = Integer.parseInt(attributeValue.substring(1));
                            }
                            else {
                                Log.e("ConstraintLayoutStates", "error in parsing id");
                                int1 = identifier;
                            }
                        }
                        b.p(context, xmlPullParser);
                        this.e.put(int1, (Object)b);
                        break;
                    }
                }
            }
        }
    }
    
    public static final class a
    {
        public int a;
        public ArrayList<b> b;
        public int c;
        public androidx.constraintlayout.widget.b d;
        
        public a(final Context context, final XmlPullParser xmlPullParser) {
            this.b = new ArrayList<b>();
            this.c = -1;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), dnl.a1);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                }
                else if (index == 1) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    final String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        (this.d = new androidx.constraintlayout.widget.b()).g((ConstraintLayout)LayoutInflater.from(context).inflate(this.c, (ViewGroup)null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
        
        public final int a(final float n, final float n2) {
            for (int i = 0; i < this.b.size(); ++i) {
                if (this.b.get(i).a(n, n2)) {
                    return i;
                }
            }
            return -1;
        }
    }
    
    public static final class b
    {
        public float a;
        public float b;
        public float c;
        public float d;
        public int e;
        public androidx.constraintlayout.widget.b f;
        
        public b(final Context context, final XmlPullParser xmlPullParser) {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), dnl.e1);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    final String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        (this.f = new androidx.constraintlayout.widget.b()).g((ConstraintLayout)LayoutInflater.from(context).inflate(this.e, (ViewGroup)null));
                    }
                }
                else if (index == 1) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                }
                else if (index == 2) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                }
                else if (index == 3) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                }
                else if (index == 4) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                }
                else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
        
        public final boolean a(final float n, final float n2) {
            return (Float.isNaN(this.a) || n >= this.a) && (Float.isNaN(this.b) || n2 >= this.b) && (Float.isNaN(this.c) || n <= this.c) && (Float.isNaN(this.d) || n2 <= this.d);
        }
    }
}
