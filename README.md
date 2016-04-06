Discription about each job
--------------------------
Hadoop-Spark-GraphX:

Load data(input triple files) into HDFS(by using HDFS commands)

SDLJOB1:
Read data files(ntriples) from HDFS, parse triples, Identify patients and create GraphX input format , patient files back in HDFS.

SDLJOB2:
Load GraphX input format, patient files(output files from SDLJOB1-V3).Use this input create graph and apply pregel algorithm, and output of the pregel algorithm(quads) is writern to HDFS.

SDLJOB3:
Load patients file and output file of job2 to process and generate nquads file by patient wise and write back to HDFS.


Hadoop-Spark-Cassandra:

Load data(input triple filles) into HDFS(by using HDFS commands)
Manually create cassandra keyspace(DB) and Table which is hash partitioned by subject-prediicate-object

SDLJOB1:
Load using spark job data from HDFS into cassandra (keyspace) table

SDLJOB2:
spark job to recursively iterates over the patient inverted tree of triples and update each triple with the patient-id and write into a file name with patient-id into linux filesystem
