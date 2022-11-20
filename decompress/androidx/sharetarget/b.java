// 
// Decompiled by Procyon v0.6.0
// 

package androidx.sharetarget;

import android.content.pm.PackageItemInfo;
import android.os.BaseBundle;
import org.xmlpull.v1.XmlPullParser;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import android.util.Log;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.Context;
import java.util.Objects;
import android.content.res.XmlResourceParser;
import java.util.ArrayList;

public final class b
{
    public static volatile ArrayList<a> a;
    public static final Object b;
    
    static {
        b = new Object();
    }
    
    public static String a(final XmlResourceParser xmlResourceParser, final String s) {
        String s2;
        if ((s2 = ((XmlPullParser)xmlResourceParser).getAttributeValue("http://schemas.android.com/apk/res/android", s)) == null) {
            s2 = ((XmlPullParser)xmlResourceParser).getAttributeValue((String)null, s);
        }
        return s2;
    }
    
    public static a b(final XmlResourceParser xmlResourceParser) throws Exception {
        final String a = a(xmlResourceParser, "targetClass");
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        while (true) {
            final int next = ((XmlPullParser)xmlResourceParser).next();
            if (next == 1) {
                break;
            }
            if (next == 2) {
                final String name = ((XmlPullParser)xmlResourceParser).getName();
                Objects.requireNonNull(name);
                if (!name.equals("data")) {
                    if (!name.equals("category")) {
                        continue;
                    }
                    list2.add(a(xmlResourceParser, "name"));
                }
                else {
                    a(xmlResourceParser, "scheme");
                    a(xmlResourceParser, "host");
                    a(xmlResourceParser, "port");
                    a(xmlResourceParser, "path");
                    a(xmlResourceParser, "pathPattern");
                    a(xmlResourceParser, "pathPrefix");
                    list.add(new a.a(a(xmlResourceParser, "mimeType")));
                }
            }
            else {
                if (next == 3 && ((XmlPullParser)xmlResourceParser).getName().equals("share-target")) {
                    break;
                }
                continue;
            }
        }
        if (!list.isEmpty() && a != null && !list2.isEmpty()) {
            return new a(list.toArray(new a.a[list.size()]), a, list2.toArray(new String[list2.size()]));
        }
        return null;
    }
    
    public static ArrayList<a> c(final Context context) {
        final ArrayList list = new ArrayList();
        final Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        final List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities == null) {
            return list;
        }
        final Iterator iterator = queryIntentActivities.iterator();
        while (iterator.hasNext()) {
            final ActivityInfo activityInfo = ((ResolveInfo)iterator.next()).activityInfo;
            final Bundle metaData = activityInfo.metaData;
            if (metaData != null && ((BaseBundle)metaData).containsKey("android.app.shortcuts")) {
                final ArrayList<a> list2 = new ArrayList<a>();
                final XmlResourceParser loadXmlMetaData = ((PackageItemInfo)activityInfo).loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
                if (loadXmlMetaData == null) {
                    final StringBuilder j = fu8.j("Failed to open android.app.shortcuts meta-data resource of ");
                    j.append(activityInfo.name);
                    throw new IllegalArgumentException(j.toString());
                }
                try {
                    while (true) {
                        final int next = ((XmlPullParser)loadXmlMetaData).next();
                        if (next == 1) {
                            break;
                        }
                        if (next != 2 || !((XmlPullParser)loadXmlMetaData).getName().equals("share-target")) {
                            continue;
                        }
                        final a b = b(loadXmlMetaData);
                        if (b == null) {
                            continue;
                        }
                        list2.add(b);
                    }
                }
                catch (final Exception ex) {
                    Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", (Throwable)ex);
                }
                loadXmlMetaData.close();
                list.addAll(list2);
            }
        }
        return list;
    }
}
