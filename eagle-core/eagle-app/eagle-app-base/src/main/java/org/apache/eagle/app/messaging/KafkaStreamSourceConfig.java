/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.eagle.app.messaging;

import org.apache.eagle.metadata.model.StreamSourceConfig;

public class KafkaStreamSourceConfig implements StreamSourceConfig {
    private static final String DEFAULT_CONSUMER_GROUP_ID = "eagleKafkaSource";
    private static final String DEFAULT_TRANSACTION_ZK_ROOT = "/consumers";
    private static final Class<? extends backtype.storm.spout.Scheme> DEFAULT_KAFKA_SCHEMA = JsonSchema.class;

    // Read Config
    private String topicId;
    private String brokerZkQuorum;
    private String brokerZkBasePath;
    private String transactionZkServers;

    private int fetchSize = 1048576;
    private String transactionZKRoot = DEFAULT_TRANSACTION_ZK_ROOT;
    private String consumerGroupId = DEFAULT_CONSUMER_GROUP_ID;
    private String brokerZkPath = "/brokers";
    private long transactionStateUpdateMS = 2000;
    private int startOffsetTime = -1;
    private boolean forceFromStart = false;
    private Class<? extends backtype.storm.spout.Scheme> schemaClass = DEFAULT_KAFKA_SCHEMA;

    public String getBrokerZkQuorum() {
        return brokerZkQuorum;
    }

    public void setBrokerZkQuorum(String brokerZkQuorum) {
        this.brokerZkQuorum = brokerZkQuorum;
    }

    public String getBrokerZkBasePath() {
        return brokerZkBasePath;
    }

    public void setBrokerZkBasePath(String brokerZkBasePath) {
        this.brokerZkBasePath = brokerZkBasePath;
    }

    public int getFetchSize() {
        return fetchSize;
    }

    public void setFetchSize(int fetchSize) {
        this.fetchSize = fetchSize;
    }

    public String getTransactionZKRoot() {
        return transactionZKRoot;
    }

    public void setTransactionZKRoot(String transactionZKRoot) {
        this.transactionZKRoot = transactionZKRoot;
    }

    public String getConsumerGroupId() {
        return consumerGroupId;
    }

    public void setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
    }

    public String getBrokerZkPath() {
        return brokerZkPath;
    }

    public void setBrokerZkPath(String brokerZkPath) {
        this.brokerZkPath = brokerZkPath;
    }

    public String getTransactionZkServers() {
        return transactionZkServers;
    }

    public void setTransactionZkServers(String transactionZkServers) {
        this.transactionZkServers = transactionZkServers;
    }

    public long getTransactionStateUpdateMS() {
        return transactionStateUpdateMS;
    }

    public void setTransactionStateUpdateMS(long transactionStateUpdateMS) {
        this.transactionStateUpdateMS = transactionStateUpdateMS;
    }

    public int getStartOffsetTime() {
        return startOffsetTime;
    }

    public void setStartOffsetTime(int startOffsetTime) {
        this.startOffsetTime = startOffsetTime;
    }

    public boolean isForceFromStart() {
        return forceFromStart;
    }

    public void setForceFromStart(boolean forceFromStart) {
        this.forceFromStart = forceFromStart;
    }

    public Class<? extends backtype.storm.spout.Scheme> getSchemaClass() {
        return schemaClass;
    }

    public void setSchemaClass(Class<? extends backtype.storm.spout.Scheme> schemaClass) {
        this.schemaClass = schemaClass;
    }

    @Override
    public String getType() {
        return "KAFKA";
    }

    @Override
    public Class<?> getSourceType() {
        return KafkaStreamSource.class;
    }

    @Override
    public Class<? extends StreamSourceConfig> getConfigType() {
        return StreamSourceConfig.class;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }
}
