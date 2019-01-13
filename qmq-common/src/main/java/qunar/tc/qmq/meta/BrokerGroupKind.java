/*
 * Copyright 2018 Qunar, Inc.
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
 */

package qunar.tc.qmq.meta;

/**
 * @author keli.wang
 * @since 2018-12-05
 */
public enum BrokerGroupKind {
    NORMAL(1),
    DELAY(2);

    private final int code;

    BrokerGroupKind(final int code) {
        this.code = code;
    }

    public static BrokerGroupKind fromCode(final int code) {
        for (final BrokerGroupKind kind : values()) {
            if (kind.getCode() == code) {
                return kind;
            }
        }

        throw new RuntimeException("unknown broker group kind code " + code);
    }

    public int getCode() {
        return code;
    }}
