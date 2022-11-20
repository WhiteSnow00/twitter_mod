import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import android.util.Base64;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import android.util.JsonReader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k07
{
    public static final xde a;
    
    static {
        final yde yde = new yde();
        k71.a.a((s3a)yde);
        yde.d = true;
        a = new xde(yde);
    }
    
    public static i07$e$d$a$b$d$b a(final JsonReader jsonReader) {
        final ma1$a ma1$a = new ma1$a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            int n = -1;
            switch (nextName) {
                case "importance": {
                    n = 4;
                    break;
                }
                case "file": {
                    n = 3;
                    break;
                }
                case "pc": {
                    n = 2;
                    break;
                }
                case "symbol": {
                    n = 1;
                    break;
                }
                case "offset": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    ma1$a.e = jsonReader.nextInt();
                    continue;
                }
                case 3: {
                    ma1$a.c = jsonReader.nextString();
                    continue;
                }
                case 2: {
                    ma1$a.a = jsonReader.nextLong();
                    continue;
                }
                case 1: {
                    final String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null symbol");
                    ma1$a.b = nextString;
                    continue;
                }
                case 0: {
                    ma1$a.d = jsonReader.nextLong();
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return ma1$a.a();
    }
    
    public static i07$c b(final JsonReader jsonReader) {
        jsonReader.beginObject();
        String nextString = null;
        String nextString2 = null;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                }
                else {
                    nextString2 = jsonReader.nextString();
                    Objects.requireNonNull(nextString2, "Null value");
                }
            }
            else {
                nextString = jsonReader.nextString();
                Objects.requireNonNull(nextString, "Null key");
            }
        }
        jsonReader.endObject();
        String s;
        if (nextString == null) {
            s = " key";
        }
        else {
            s = "";
        }
        String h = s;
        if (nextString2 == null) {
            h = hmg.h(s, " value");
        }
        if (h.isEmpty()) {
            return (i07$c)new y91(nextString, nextString2);
        }
        throw new IllegalStateException(hmg.h("Missing required properties:", h));
    }
    
    public static <T> fdd<T> c(final JsonReader jsonReader, final a<T> a) throws IOException {
        final ArrayList list = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            list.add(a.j(jsonReader));
        }
        jsonReader.endArray();
        return new fdd<T>(list);
    }
    
    public static i07$e$d d(final JsonReader jsonReader) throws IOException {
        final fa1.a a = new fa1.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            int n = 0;
            Label_0174: {
                switch (nextName) {
                    case "timestamp": {
                        n = 4;
                        break Label_0174;
                    }
                    case "type": {
                        n = 3;
                        break Label_0174;
                    }
                    case "log": {
                        n = 2;
                        break Label_0174;
                    }
                    case "app": {
                        n = 1;
                        break Label_0174;
                    }
                    case "device": {
                        n = 0;
                        break Label_0174;
                    }
                    default:
                        break;
                }
                n = -1;
            }
            String s = "";
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                jsonReader.skipValue();
                            }
                            else {
                                a.b(jsonReader.nextLong());
                            }
                        }
                        else {
                            a.c(jsonReader.nextString());
                        }
                    }
                    else {
                        jsonReader.beginObject();
                        String nextString = null;
                        while (jsonReader.hasNext()) {
                            final String nextName2 = jsonReader.nextName();
                            Objects.requireNonNull(nextName2);
                            if (!nextName2.equals("content")) {
                                jsonReader.skipValue();
                            }
                            else {
                                nextString = jsonReader.nextString();
                                Objects.requireNonNull(nextString, "Null content");
                            }
                        }
                        jsonReader.endObject();
                        if (nextString == null) {
                            s = " content";
                        }
                        if (!s.isEmpty()) {
                            throw new IllegalStateException(hmg.h("Missing required properties:", s));
                        }
                        a.e = (i07$e$d$d)new oa1(nextString);
                    }
                }
                else {
                    final ga1$b ga1$b = new ga1$b();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        final String nextName3 = jsonReader.nextName();
                        Objects.requireNonNull(nextName3);
                        int n2 = 0;
                        Label_0514: {
                            switch (nextName3) {
                                case "uiOrientation": {
                                    n2 = 4;
                                    break Label_0514;
                                }
                                case "customAttributes": {
                                    n2 = 3;
                                    break Label_0514;
                                }
                                case "internalKeys": {
                                    n2 = 2;
                                    break Label_0514;
                                }
                                case "execution": {
                                    n2 = 1;
                                    break Label_0514;
                                }
                                case "background": {
                                    n2 = 0;
                                    break Label_0514;
                                }
                                default:
                                    break;
                            }
                            n2 = -1;
                        }
                        if (n2 != 0) {
                            if (n2 != 1) {
                                if (n2 != 2) {
                                    if (n2 != 3) {
                                        if (n2 != 4) {
                                            jsonReader.skipValue();
                                        }
                                        else {
                                            ga1$b.b(jsonReader.nextInt());
                                        }
                                    }
                                    else {
                                        final ArrayList<i07$c> list = new ArrayList<i07$c>();
                                        jsonReader.beginArray();
                                        while (jsonReader.hasNext()) {
                                            list.add(b(jsonReader));
                                        }
                                        jsonReader.endArray();
                                        ga1$b.b = new fdd((List<E>)list);
                                    }
                                }
                                else {
                                    final ArrayList<i07$c> list2 = new ArrayList<i07$c>();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        list2.add(b(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    ga1$b.c = new fdd((List<E>)list2);
                                }
                            }
                            else {
                                jsonReader.beginObject();
                                fdd<Object> c = null;
                                i07$e$d$a$b$b e = null;
                                i07$a a2 = null;
                                i07$e$d$a$b$c a3 = null;
                                fdd<Object> c2 = null;
                                while (jsonReader.hasNext()) {
                                    final String nextName4 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName4);
                                    int n3 = 0;
                                    Label_0840: {
                                        switch (nextName4) {
                                            case "exception": {
                                                n3 = 4;
                                                break Label_0840;
                                            }
                                            case "binaries": {
                                                n3 = 3;
                                                break Label_0840;
                                            }
                                            case "signal": {
                                                n3 = 2;
                                                break Label_0840;
                                            }
                                            case "threads": {
                                                n3 = 1;
                                                break Label_0840;
                                            }
                                            case "appExitInfo": {
                                                n3 = 0;
                                                break Label_0840;
                                            }
                                            default:
                                                break;
                                        }
                                        n3 = -1;
                                    }
                                    if (n3 != 0) {
                                        if (n3 != 1) {
                                            if (n3 != 2) {
                                                if (n3 != 3) {
                                                    if (n3 != 4) {
                                                        jsonReader.skipValue();
                                                    }
                                                    else {
                                                        e = e(jsonReader);
                                                    }
                                                }
                                                else {
                                                    c2 = c(jsonReader, (a<Object>)soo.O0);
                                                }
                                            }
                                            else {
                                                final ka1$a ka1$a = new ka1$a();
                                                jsonReader.beginObject();
                                                while (jsonReader.hasNext()) {
                                                    final String nextName5 = jsonReader.nextName();
                                                    Objects.requireNonNull(nextName5);
                                                    final int hashCode = nextName5.hashCode();
                                                    int n4 = 0;
                                                    Label_1008: {
                                                        if (hashCode != -1147692044) {
                                                            if (hashCode != 3059181) {
                                                                if (hashCode == 3373707) {
                                                                    if (nextName5.equals("name")) {
                                                                        n4 = 2;
                                                                        break Label_1008;
                                                                    }
                                                                }
                                                            }
                                                            else if (nextName5.equals("code")) {
                                                                n4 = 1;
                                                                break Label_1008;
                                                            }
                                                        }
                                                        else if (nextName5.equals("address")) {
                                                            n4 = 0;
                                                            break Label_1008;
                                                        }
                                                        n4 = -1;
                                                    }
                                                    if (n4 != 0) {
                                                        if (n4 != 1) {
                                                            if (n4 != 2) {
                                                                jsonReader.skipValue();
                                                            }
                                                            else {
                                                                final String nextString2 = jsonReader.nextString();
                                                                Objects.requireNonNull(nextString2, "Null name");
                                                                ka1$a.a = nextString2;
                                                            }
                                                        }
                                                        else {
                                                            final String nextString3 = jsonReader.nextString();
                                                            Objects.requireNonNull(nextString3, "Null code");
                                                            ka1$a.b = nextString3;
                                                        }
                                                    }
                                                    else {
                                                        ka1$a.c = jsonReader.nextLong();
                                                    }
                                                }
                                                jsonReader.endObject();
                                                a3 = ka1$a.a();
                                            }
                                        }
                                        else {
                                            c = c(jsonReader, (a<Object>)b71.P0);
                                        }
                                    }
                                    else {
                                        final x91$a x91$a = new x91$a();
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            final String nextName6 = jsonReader.nextName();
                                            Objects.requireNonNull(nextName6);
                                            int n5 = 0;
                                            Label_1385: {
                                                switch (nextName6) {
                                                    case "importance": {
                                                        n5 = 7;
                                                        break Label_1385;
                                                    }
                                                    case "traceFile": {
                                                        n5 = 6;
                                                        break Label_1385;
                                                    }
                                                    case "reasonCode": {
                                                        n5 = 5;
                                                        break Label_1385;
                                                    }
                                                    case "processName": {
                                                        n5 = 4;
                                                        break Label_1385;
                                                    }
                                                    case "timestamp": {
                                                        n5 = 3;
                                                        break Label_1385;
                                                    }
                                                    case "rss": {
                                                        n5 = 2;
                                                        break Label_1385;
                                                    }
                                                    case "pss": {
                                                        n5 = 1;
                                                        break Label_1385;
                                                    }
                                                    case "pid": {
                                                        n5 = 0;
                                                        break Label_1385;
                                                    }
                                                    default:
                                                        break;
                                                }
                                                n5 = -1;
                                            }
                                            switch (n5) {
                                                default: {
                                                    jsonReader.skipValue();
                                                    continue;
                                                }
                                                case 7: {
                                                    x91$a.d = jsonReader.nextInt();
                                                    continue;
                                                }
                                                case 6: {
                                                    x91$a.h = jsonReader.nextString();
                                                    continue;
                                                }
                                                case 5: {
                                                    x91$a.c = jsonReader.nextInt();
                                                    continue;
                                                }
                                                case 4: {
                                                    final String nextString4 = jsonReader.nextString();
                                                    Objects.requireNonNull(nextString4, "Null processName");
                                                    x91$a.b = nextString4;
                                                    continue;
                                                }
                                                case 3: {
                                                    x91$a.g = jsonReader.nextLong();
                                                    continue;
                                                }
                                                case 2: {
                                                    x91$a.f = jsonReader.nextLong();
                                                    continue;
                                                }
                                                case 1: {
                                                    x91$a.e = jsonReader.nextLong();
                                                    continue;
                                                }
                                                case 0: {
                                                    x91$a.a = jsonReader.nextInt();
                                                    continue;
                                                }
                                            }
                                        }
                                        jsonReader.endObject();
                                        a2 = x91$a.a();
                                    }
                                }
                                jsonReader.endObject();
                                String s2;
                                if (a3 == null) {
                                    s2 = " signal";
                                }
                                else {
                                    s2 = "";
                                }
                                String h = s2;
                                if (c2 == null) {
                                    h = hmg.h(s2, " binaries");
                                }
                                if (!h.isEmpty()) {
                                    throw new IllegalStateException(hmg.h("Missing required properties:", h));
                                }
                                ga1$b.a = (i07$e$d$a$b)new ha1((fdd)c, e, a2, a3, (fdd)c2, (ha1.ha1$a)null);
                            }
                        }
                        else {
                            ga1$b.d = jsonReader.nextBoolean();
                        }
                    }
                    jsonReader.endObject();
                    a.c = ga1$b.a();
                }
            }
            else {
                final na1$a na1$a = new na1$a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    final String nextName7 = jsonReader.nextName();
                    Objects.requireNonNull(nextName7);
                    int n6 = 0;
                    Label_1889: {
                        switch (nextName7) {
                            case "proximityOn": {
                                n6 = 5;
                                break Label_1889;
                            }
                            case "ramUsed": {
                                n6 = 4;
                                break Label_1889;
                            }
                            case "diskUsed": {
                                n6 = 3;
                                break Label_1889;
                            }
                            case "orientation": {
                                n6 = 2;
                                break Label_1889;
                            }
                            case "batteryVelocity": {
                                n6 = 1;
                                break Label_1889;
                            }
                            case "batteryLevel": {
                                n6 = 0;
                                break Label_1889;
                            }
                            default:
                                break;
                        }
                        n6 = -1;
                    }
                    if (n6 != 0) {
                        if (n6 != 1) {
                            if (n6 != 2) {
                                if (n6 != 3) {
                                    if (n6 != 4) {
                                        if (n6 != 5) {
                                            jsonReader.skipValue();
                                        }
                                        else {
                                            na1$a.c = jsonReader.nextBoolean();
                                        }
                                    }
                                    else {
                                        na1$a.e = jsonReader.nextLong();
                                    }
                                }
                                else {
                                    na1$a.f = jsonReader.nextLong();
                                }
                            }
                            else {
                                na1$a.d = jsonReader.nextInt();
                            }
                        }
                        else {
                            na1$a.b = jsonReader.nextInt();
                        }
                    }
                    else {
                        na1$a.a = jsonReader.nextDouble();
                    }
                }
                jsonReader.endObject();
                a.d = na1$a.a();
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static i07$e$d$a$b$b e(final JsonReader jsonReader) throws IOException {
        final ja1$b ja1$b = new ja1$b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            int n = -1;
            switch (nextName) {
                case "overflowCount": {
                    n = 4;
                    break;
                }
                case "causedBy": {
                    n = 3;
                    break;
                }
                case "type": {
                    n = 2;
                    break;
                }
                case "reason": {
                    n = 1;
                    break;
                }
                case "frames": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    ja1$b.e = jsonReader.nextInt();
                    continue;
                }
                case 3: {
                    ja1$b.d = e(jsonReader);
                    continue;
                }
                case 2: {
                    final String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null type");
                    ja1$b.a = nextString;
                    continue;
                }
                case 1: {
                    ja1$b.b = jsonReader.nextString();
                    continue;
                }
                case 0: {
                    final ArrayList<i07$e$d$a$b$d$b> list = new ArrayList<i07$e$d$a$b$d$b>();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        list.add(a(jsonReader));
                    }
                    jsonReader.endArray();
                    ja1$b.c = new fdd((List<E>)list);
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return ja1$b.a();
    }
    
    public static i07 f(final JsonReader jsonReader) throws IOException {
        final Charset a = i07.a;
        final v91.a a2 = new v91.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            int n = 0;
            Label_0263: {
                switch (nextName) {
                    case "session": {
                        n = 7;
                        break Label_0263;
                    }
                    case "displayVersion": {
                        n = 6;
                        break Label_0263;
                    }
                    case "platform": {
                        n = 5;
                        break Label_0263;
                    }
                    case "installationUuid": {
                        n = 4;
                        break Label_0263;
                    }
                    case "gmpAppId": {
                        n = 3;
                        break Label_0263;
                    }
                    case "buildVersion": {
                        n = 2;
                        break Label_0263;
                    }
                    case "sdkVersion": {
                        n = 1;
                        break Label_0263;
                    }
                    case "ndkPayload": {
                        n = 0;
                        break Label_0263;
                    }
                    default:
                        break;
                }
                n = -1;
            }
            String s = "";
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 7: {
                    final ba1.b b = new ba1.b();
                    b.b(false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        final String nextName2 = jsonReader.nextName();
                        Objects.requireNonNull(nextName2);
                        int n2 = 0;
                        Label_0670: {
                            switch (nextName2) {
                                case "generatorType": {
                                    n2 = 10;
                                    break Label_0670;
                                }
                                case "crashed": {
                                    n2 = 9;
                                    break Label_0670;
                                }
                                case "generator": {
                                    n2 = 8;
                                    break Label_0670;
                                }
                                case "user": {
                                    n2 = 7;
                                    break Label_0670;
                                }
                                case "app": {
                                    n2 = 6;
                                    break Label_0670;
                                }
                                case "os": {
                                    n2 = 5;
                                    break Label_0670;
                                }
                                case "events": {
                                    n2 = 4;
                                    break Label_0670;
                                }
                                case "device": {
                                    n2 = 3;
                                    break Label_0670;
                                }
                                case "endedAt": {
                                    n2 = 2;
                                    break Label_0670;
                                }
                                case "identifier": {
                                    n2 = 1;
                                    break Label_0670;
                                }
                                case "startedAt": {
                                    n2 = 0;
                                    break Label_0670;
                                }
                                default:
                                    break;
                            }
                            n2 = -1;
                        }
                        String s2 = " identifier";
                        switch (n2) {
                            default: {
                                jsonReader.skipValue();
                                continue;
                            }
                            case 10: {
                                b.k = jsonReader.nextInt();
                                continue;
                            }
                            case 9: {
                                b.b(jsonReader.nextBoolean());
                                continue;
                            }
                            case 8: {
                                final String nextString = jsonReader.nextString();
                                Objects.requireNonNull(nextString, "Null generator");
                                b.a = nextString;
                                continue;
                            }
                            case 7: {
                                jsonReader.beginObject();
                                String nextString2 = null;
                                while (jsonReader.hasNext()) {
                                    final String nextName3 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName3);
                                    if (!nextName3.equals("identifier")) {
                                        jsonReader.skipValue();
                                    }
                                    else {
                                        nextString2 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString2, "Null identifier");
                                    }
                                }
                                jsonReader.endObject();
                                if (nextString2 != null) {
                                    s2 = "";
                                }
                                if (s2.isEmpty()) {
                                    b.g = (i07$e$f)new qa1(nextString2);
                                    continue;
                                }
                                throw new IllegalStateException(hmg.h("Missing required properties:", s2));
                            }
                            case 6: {
                                jsonReader.beginObject();
                                String nextString3 = null;
                                String nextString4 = null;
                                String nextString5 = null;
                                String nextString6 = null;
                                String nextString7 = null;
                                String nextString8 = null;
                                while (jsonReader.hasNext()) {
                                    final String nextName4 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName4);
                                    int n3 = 0;
                                    Label_1123: {
                                        switch (nextName4) {
                                            case "displayVersion": {
                                                n3 = 5;
                                                break Label_1123;
                                            }
                                            case "installationUuid": {
                                                n3 = 4;
                                                break Label_1123;
                                            }
                                            case "version": {
                                                n3 = 3;
                                                break Label_1123;
                                            }
                                            case "developmentPlatformVersion": {
                                                n3 = 2;
                                                break Label_1123;
                                            }
                                            case "developmentPlatform": {
                                                n3 = 1;
                                                break Label_1123;
                                            }
                                            case "identifier": {
                                                n3 = 0;
                                                break Label_1123;
                                            }
                                            default:
                                                break;
                                        }
                                        n3 = -1;
                                    }
                                    if (n3 != 0) {
                                        if (n3 != 1) {
                                            if (n3 != 2) {
                                                if (n3 != 3) {
                                                    if (n3 != 4) {
                                                        if (n3 != 5) {
                                                            jsonReader.skipValue();
                                                        }
                                                        else {
                                                            nextString5 = jsonReader.nextString();
                                                        }
                                                    }
                                                    else {
                                                        nextString6 = jsonReader.nextString();
                                                    }
                                                }
                                                else {
                                                    nextString4 = jsonReader.nextString();
                                                    Objects.requireNonNull(nextString4, "Null version");
                                                }
                                            }
                                            else {
                                                nextString8 = jsonReader.nextString();
                                            }
                                        }
                                        else {
                                            nextString7 = jsonReader.nextString();
                                        }
                                    }
                                    else {
                                        nextString3 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString3, "Null identifier");
                                    }
                                }
                                jsonReader.endObject();
                                if (nextString3 != null) {
                                    s2 = "";
                                }
                                String h = s2;
                                if (nextString4 == null) {
                                    h = hmg.h(s2, " version");
                                }
                                if (h.isEmpty()) {
                                    b.f = (i07$e$a)new ca1(nextString3, nextString4, nextString5, nextString6, nextString7, nextString8);
                                    continue;
                                }
                                throw new IllegalStateException(hmg.h("Missing required properties:", h));
                            }
                            case 5: {
                                final pa1$a pa1$a = new pa1$a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    final String nextName5 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName5);
                                    int n4 = 0;
                                    Label_1465: {
                                        switch (nextName5) {
                                            case "platform": {
                                                n4 = 3;
                                                break Label_1465;
                                            }
                                            case "version": {
                                                n4 = 2;
                                                break Label_1465;
                                            }
                                            case "jailbroken": {
                                                n4 = 1;
                                                break Label_1465;
                                            }
                                            case "buildVersion": {
                                                n4 = 0;
                                                break Label_1465;
                                            }
                                            default:
                                                break;
                                        }
                                        n4 = -1;
                                    }
                                    if (n4 != 0) {
                                        if (n4 != 1) {
                                            if (n4 != 2) {
                                                if (n4 != 3) {
                                                    jsonReader.skipValue();
                                                }
                                                else {
                                                    pa1$a.a = jsonReader.nextInt();
                                                }
                                            }
                                            else {
                                                final String nextString9 = jsonReader.nextString();
                                                Objects.requireNonNull(nextString9, "Null version");
                                                pa1$a.b = nextString9;
                                            }
                                        }
                                        else {
                                            pa1$a.d = jsonReader.nextBoolean();
                                        }
                                    }
                                    else {
                                        final String nextString10 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString10, "Null buildVersion");
                                        pa1$a.c = nextString10;
                                    }
                                }
                                jsonReader.endObject();
                                b.h = pa1$a.a();
                                continue;
                            }
                            case 4: {
                                final ArrayList<i07$e$d> list = (ArrayList<i07$e$d>)new ArrayList<Object>();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    list.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                b.j = new fdd<i07$e$d>((List<Object>)list);
                                continue;
                            }
                            case 3: {
                                final ea1.a a3 = new ea1.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    final String nextName6 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName6);
                                    int n5 = 0;
                                    Label_1914: {
                                        switch (nextName6) {
                                            case "modelClass": {
                                                n5 = 8;
                                                break Label_1914;
                                            }
                                            case "state": {
                                                n5 = 7;
                                                break Label_1914;
                                            }
                                            case "model": {
                                                n5 = 6;
                                                break Label_1914;
                                            }
                                            case "cores": {
                                                n5 = 5;
                                                break Label_1914;
                                            }
                                            case "diskSpace": {
                                                n5 = 4;
                                                break Label_1914;
                                            }
                                            case "arch": {
                                                n5 = 3;
                                                break Label_1914;
                                            }
                                            case "ram": {
                                                n5 = 2;
                                                break Label_1914;
                                            }
                                            case "manufacturer": {
                                                n5 = 1;
                                                break Label_1914;
                                            }
                                            case "simulator": {
                                                n5 = 0;
                                                break Label_1914;
                                            }
                                            default:
                                                break;
                                        }
                                        n5 = -1;
                                    }
                                    switch (n5) {
                                        default: {
                                            jsonReader.skipValue();
                                            continue;
                                        }
                                        case 8: {
                                            final String nextString11 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString11, "Null modelClass");
                                            a3.i = nextString11;
                                            continue;
                                        }
                                        case 7: {
                                            a3.g = jsonReader.nextInt();
                                            continue;
                                        }
                                        case 6: {
                                            final String nextString12 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString12, "Null model");
                                            a3.b = nextString12;
                                            continue;
                                        }
                                        case 5: {
                                            a3.c = jsonReader.nextInt();
                                            continue;
                                        }
                                        case 4: {
                                            a3.e = jsonReader.nextLong();
                                            continue;
                                        }
                                        case 3: {
                                            a3.a = jsonReader.nextInt();
                                            continue;
                                        }
                                        case 2: {
                                            a3.d = jsonReader.nextLong();
                                            continue;
                                        }
                                        case 1: {
                                            final String nextString13 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString13, "Null manufacturer");
                                            a3.h = nextString13;
                                            continue;
                                        }
                                        case 0: {
                                            a3.f = jsonReader.nextBoolean();
                                            continue;
                                        }
                                    }
                                }
                                jsonReader.endObject();
                                b.i = a3.a();
                                continue;
                            }
                            case 2: {
                                b.d = jsonReader.nextLong();
                                continue;
                            }
                            case 1: {
                                b.b = new String(Base64.decode(jsonReader.nextString(), 2), i07.a);
                                continue;
                            }
                            case 0: {
                                b.c = jsonReader.nextLong();
                                continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    a2.g = b.a();
                    continue;
                }
                case 6: {
                    final String nextString14 = jsonReader.nextString();
                    Objects.requireNonNull(nextString14, "Null displayVersion");
                    a2.f = nextString14;
                    continue;
                }
                case 5: {
                    a2.c = jsonReader.nextInt();
                    continue;
                }
                case 4: {
                    final String nextString15 = jsonReader.nextString();
                    Objects.requireNonNull(nextString15, "Null installationUuid");
                    a2.d = nextString15;
                    continue;
                }
                case 3: {
                    final String nextString16 = jsonReader.nextString();
                    Objects.requireNonNull(nextString16, "Null gmpAppId");
                    a2.b = nextString16;
                    continue;
                }
                case 2: {
                    final String nextString17 = jsonReader.nextString();
                    Objects.requireNonNull(nextString17, "Null buildVersion");
                    a2.e = nextString17;
                    continue;
                }
                case 1: {
                    final String nextString18 = jsonReader.nextString();
                    Objects.requireNonNull(nextString18, "Null sdkVersion");
                    a2.a = nextString18;
                    continue;
                }
                case 0: {
                    jsonReader.beginObject();
                    fdd<Object> c = null;
                    String nextString19 = null;
                    while (jsonReader.hasNext()) {
                        final String nextName7 = jsonReader.nextName();
                        Objects.requireNonNull(nextName7);
                        if (!nextName7.equals("files")) {
                            if (!nextName7.equals("orgId")) {
                                jsonReader.skipValue();
                            }
                            else {
                                nextString19 = jsonReader.nextString();
                            }
                        }
                        else {
                            c = c(jsonReader, (a<Object>)i71.J0);
                        }
                    }
                    jsonReader.endObject();
                    if (c == null) {
                        s = " files";
                    }
                    if (s.isEmpty()) {
                        a2.h = (i07$d)new z91((fdd)c, nextString19, (z91$a)null);
                        continue;
                    }
                    throw new IllegalStateException(hmg.h("Missing required properties:", s));
                }
            }
        }
        jsonReader.endObject();
        return a2.a();
    }
    
    public final i07 g(final String s) throws IOException {
        try {
            final JsonReader jsonReader = new JsonReader((Reader)new StringReader(s));
            try {
                final i07 f = f(jsonReader);
                jsonReader.close();
                return f;
            }
            finally {
                try {
                    jsonReader.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)s).addSuppressed(t);
                }
            }
        }
        catch (final IllegalStateException ex) {
            throw new IOException(ex);
        }
    }
    
    public final String h(final i07 i07) {
        return k07.a.a((Object)i07);
    }
    
    public interface a<T>
    {
        T j(final JsonReader p0) throws IOException;
    }
}
