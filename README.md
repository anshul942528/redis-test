# redis-test
Redis sentinel use case in spring-boot

here we have 1 master 1 slave 3 sentinels

                                master
                                  |
                                slave
                                  |
                     -----------------------------
                     |             |             |
                  sentinel      sentinel      sentinel
