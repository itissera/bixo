/*
 * Copyright 2009-2013 Scale Unlimited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package bixo.utils;

import cascading.tuple.Fields;

public class FieldUtils {

    public static Fields add(Fields fields, String... moreFieldNames) {
        Fields moreFields = new Fields(moreFieldNames);
        return fields.append(moreFields);
    }

    public static Fields combine(Fields fields, Fields moreFields) {
        return fields.append(moreFields);
    }

}
